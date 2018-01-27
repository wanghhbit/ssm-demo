package com.whh.ssm.model;

import com.whh.ssm.core.model.BaseObject;
import java.util.Date;

public class Comment extends BaseObject {
    private Integer id;

    private Integer articleId;

    private String content;

    private Date leaveTime;

    private String leaveName;

    private String url;

    private String leaveEmail;

    private Integer sitemapId;

    private Long toutiaoId;

    private Date spriderTime;

    private String articleCreator;

    public Comment(Integer id, Integer articleId, String content, Date leaveTime, String leaveName, String url, String leaveEmail, Integer sitemapId, Long toutiaoId, Date spriderTime, String articleCreator) {
        this.id = id;
        this.articleId = articleId;
        this.content = content;
        this.leaveTime = leaveTime;
        this.leaveName = leaveName;
        this.url = url;
        this.leaveEmail = leaveEmail;
        this.sitemapId = sitemapId;
        this.toutiaoId = toutiaoId;
        this.spriderTime = spriderTime;
        this.articleCreator = articleCreator;
    }

    public Comment() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getLeaveTime() {
        return leaveTime;
    }

    public void setLeaveTime(Date leaveTime) {
        this.leaveTime = leaveTime;
    }

    public String getLeaveName() {
        return leaveName;
    }

    public void setLeaveName(String leaveName) {
        this.leaveName = leaveName == null ? null : leaveName.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getLeaveEmail() {
        return leaveEmail;
    }

    public void setLeaveEmail(String leaveEmail) {
        this.leaveEmail = leaveEmail == null ? null : leaveEmail.trim();
    }

    public Integer getSitemapId() {
        return sitemapId;
    }

    public void setSitemapId(Integer sitemapId) {
        this.sitemapId = sitemapId;
    }

    public Long getToutiaoId() {
        return toutiaoId;
    }

    public void setToutiaoId(Long toutiaoId) {
        this.toutiaoId = toutiaoId;
    }

    public Date getSpriderTime() {
        return spriderTime;
    }

    public void setSpriderTime(Date spriderTime) {
        this.spriderTime = spriderTime;
    }

    public String getArticleCreator() {
        return articleCreator;
    }

    public void setArticleCreator(String articleCreator) {
        this.articleCreator = articleCreator == null ? null : articleCreator.trim();
    }
}