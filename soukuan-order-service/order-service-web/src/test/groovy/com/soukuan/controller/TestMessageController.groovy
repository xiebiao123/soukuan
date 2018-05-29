package com.soukuan.controller

import com.soukuan.TestOrderServiceBase
import com.soukuan.client.AdvertiseClient
import com.soukuan.common.good.domain.Advertise
import com.soukuan.common.order.domain.Message
import com.soukuan.domain.ResponseEntity
import com.soukuan.util.StringUtils
import org.mockito.Mockito
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.test.context.jdbc.Sql
import org.springframework.transaction.annotation.Transactional

/**
 * Spock通过setup、expect、when和then等标签将这些步骤放在一个测试用例中。
 *
 * setup:这个块用于定义变量、准备测试数据、构建mock对象等;
 *
 * given:定义对象
 * expect:一般跟在setup块后使用,包含一些assert语句,检查在setup块中准备好的测试环境
 * when:在这个块中调用要测试的方法;
 * then : 一般跟在when后使用,尽可以包含断言语句、异常检查语句等等,用于检查要测试的方法执行后结果是否符合预期;
 * cleanup:用于清除setup块中对环境做的修改,即将当前测试用例中的修改回滚,在这个例子中我们对publisherRepository对象执行重置操作。
 */
@Transactional
@Sql(executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD, scripts = "classpath:beforeTestSql.sql")
class TestMessageController extends TestOrderServiceBase  {

    @MockBean
    AdvertiseClient advertiseClient;

    def setup(){
        Mockito.doAnswer({
            ResponseEntity result = new ResponseEntity();
            result.setRetCode("200")
            result.setRetMesg("添加成功！")
            return result
        }).when(advertiseClient).add(Mockito.any() as Advertise)
    }

    def "add"() {
        given:
            Message message = new Message()
            message.setContent("xxxxx")
        when:
            Object o = this.apiTestAssertSuccess("${MESSAGE_URL}/add", null,message)
        then:
            assert null == o
    }

    def "test"() {
        given:
        Message message = new Message()
        message.setContent("xxxxx")
        when:
        Object o = this.apiTest("${MESSAGE_URL}/test", null,message)
        then:
        assert StringUtils.isEmpty(o)
    }


}
