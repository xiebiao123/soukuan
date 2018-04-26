package com.soukuan.common.good.condition;

import com.soukuan.web.page.Pager;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Data
public class MessageCondition extends Pager implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "good_id")
    private String goodId;

    @Column(name = "message_id")
    private String messageId;

    /**
     * 创建人id
     */
    @Column(name = "creator_id")
    private String creatorId;

    /**
     * 创建人姓名
     */
    @Column(name = "creator_name")
    private String creatorName;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 0:未回复
            1:已回复
     */
    @Column(name = "reply_state")
    private String replyState;

    /**
     * c:咨询   s:留言
     */
    private String state;

    private String type;

    private String content;

}