package com.whh.ssm.model;

import com.whh.ssm.core.model.BaseObject;

public class TSprider extends BaseObject {
    private Integer id;

    private Integer siteId;

    private Integer categoryId;

    private Integer ispage;

    private Integer maxpage;

    private Integer startpage;

    private Integer incrementpage;

    private Integer runstatus;

    private Integer status;

    private Integer spridernum;

    private Integer isalbumpage;

    private Integer curpageno;

    private Integer pagesize;

    private Integer offset;

    private String spridersite;

    private String spridersitedomain;

    private String portalurl;

    private String storepath;

    private String albumurlregx;

    private String albumpageurlregx;

    private String resourceregx;

    private String albumidregx;

    private String durlregx;

    private String sourceencoding;

    private String spridername;

    private String spriderurl;

    private String expand;

    private String picdescription;

    private Integer cutfloor;

    private Integer cuttop;

    private Integer cutleft;

    private Integer cutright;

    public TSprider(Integer id, Integer siteId, Integer categoryId, Integer ispage, Integer maxpage, Integer startpage, Integer incrementpage, Integer runstatus, Integer status, Integer spridernum, Integer isalbumpage, Integer curpageno, Integer pagesize, Integer offset, String spridersite, String spridersitedomain, String portalurl, String storepath, String albumurlregx, String albumpageurlregx, String resourceregx, String albumidregx, String durlregx, String sourceencoding, String spridername, String spriderurl, String expand, String picdescription, Integer cutfloor, Integer cuttop, Integer cutleft, Integer cutright) {
        this.id = id;
        this.siteId = siteId;
        this.categoryId = categoryId;
        this.ispage = ispage;
        this.maxpage = maxpage;
        this.startpage = startpage;
        this.incrementpage = incrementpage;
        this.runstatus = runstatus;
        this.status = status;
        this.spridernum = spridernum;
        this.isalbumpage = isalbumpage;
        this.curpageno = curpageno;
        this.pagesize = pagesize;
        this.offset = offset;
        this.spridersite = spridersite;
        this.spridersitedomain = spridersitedomain;
        this.portalurl = portalurl;
        this.storepath = storepath;
        this.albumurlregx = albumurlregx;
        this.albumpageurlregx = albumpageurlregx;
        this.resourceregx = resourceregx;
        this.albumidregx = albumidregx;
        this.durlregx = durlregx;
        this.sourceencoding = sourceencoding;
        this.spridername = spridername;
        this.spriderurl = spriderurl;
        this.expand = expand;
        this.picdescription = picdescription;
        this.cutfloor = cutfloor;
        this.cuttop = cuttop;
        this.cutleft = cutleft;
        this.cutright = cutright;
    }

    public TSprider() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSiteId() {
        return siteId;
    }

    public void setSiteId(Integer siteId) {
        this.siteId = siteId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getIspage() {
        return ispage;
    }

    public void setIspage(Integer ispage) {
        this.ispage = ispage;
    }

    public Integer getMaxpage() {
        return maxpage;
    }

    public void setMaxpage(Integer maxpage) {
        this.maxpage = maxpage;
    }

    public Integer getStartpage() {
        return startpage;
    }

    public void setStartpage(Integer startpage) {
        this.startpage = startpage;
    }

    public Integer getIncrementpage() {
        return incrementpage;
    }

    public void setIncrementpage(Integer incrementpage) {
        this.incrementpage = incrementpage;
    }

    public Integer getRunstatus() {
        return runstatus;
    }

    public void setRunstatus(Integer runstatus) {
        this.runstatus = runstatus;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSpridernum() {
        return spridernum;
    }

    public void setSpridernum(Integer spridernum) {
        this.spridernum = spridernum;
    }

    public Integer getIsalbumpage() {
        return isalbumpage;
    }

    public void setIsalbumpage(Integer isalbumpage) {
        this.isalbumpage = isalbumpage;
    }

    public Integer getCurpageno() {
        return curpageno;
    }

    public void setCurpageno(Integer curpageno) {
        this.curpageno = curpageno;
    }

    public Integer getPagesize() {
        return pagesize;
    }

    public void setPagesize(Integer pagesize) {
        this.pagesize = pagesize;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public String getSpridersite() {
        return spridersite;
    }

    public void setSpridersite(String spridersite) {
        this.spridersite = spridersite == null ? null : spridersite.trim();
    }

    public String getSpridersitedomain() {
        return spridersitedomain;
    }

    public void setSpridersitedomain(String spridersitedomain) {
        this.spridersitedomain = spridersitedomain == null ? null : spridersitedomain.trim();
    }

    public String getPortalurl() {
        return portalurl;
    }

    public void setPortalurl(String portalurl) {
        this.portalurl = portalurl == null ? null : portalurl.trim();
    }

    public String getStorepath() {
        return storepath;
    }

    public void setStorepath(String storepath) {
        this.storepath = storepath == null ? null : storepath.trim();
    }

    public String getAlbumurlregx() {
        return albumurlregx;
    }

    public void setAlbumurlregx(String albumurlregx) {
        this.albumurlregx = albumurlregx == null ? null : albumurlregx.trim();
    }

    public String getAlbumpageurlregx() {
        return albumpageurlregx;
    }

    public void setAlbumpageurlregx(String albumpageurlregx) {
        this.albumpageurlregx = albumpageurlregx == null ? null : albumpageurlregx.trim();
    }

    public String getResourceregx() {
        return resourceregx;
    }

    public void setResourceregx(String resourceregx) {
        this.resourceregx = resourceregx == null ? null : resourceregx.trim();
    }

    public String getAlbumidregx() {
        return albumidregx;
    }

    public void setAlbumidregx(String albumidregx) {
        this.albumidregx = albumidregx == null ? null : albumidregx.trim();
    }

    public String getDurlregx() {
        return durlregx;
    }

    public void setDurlregx(String durlregx) {
        this.durlregx = durlregx == null ? null : durlregx.trim();
    }

    public String getSourceencoding() {
        return sourceencoding;
    }

    public void setSourceencoding(String sourceencoding) {
        this.sourceencoding = sourceencoding == null ? null : sourceencoding.trim();
    }

    public String getSpridername() {
        return spridername;
    }

    public void setSpridername(String spridername) {
        this.spridername = spridername == null ? null : spridername.trim();
    }

    public String getSpriderurl() {
        return spriderurl;
    }

    public void setSpriderurl(String spriderurl) {
        this.spriderurl = spriderurl == null ? null : spriderurl.trim();
    }

    public String getExpand() {
        return expand;
    }

    public void setExpand(String expand) {
        this.expand = expand == null ? null : expand.trim();
    }

    public String getPicdescription() {
        return picdescription;
    }

    public void setPicdescription(String picdescription) {
        this.picdescription = picdescription == null ? null : picdescription.trim();
    }

    public Integer getCutfloor() {
        return cutfloor;
    }

    public void setCutfloor(Integer cutfloor) {
        this.cutfloor = cutfloor;
    }

    public Integer getCuttop() {
        return cuttop;
    }

    public void setCuttop(Integer cuttop) {
        this.cuttop = cuttop;
    }

    public Integer getCutleft() {
        return cutleft;
    }

    public void setCutleft(Integer cutleft) {
        this.cutleft = cutleft;
    }

    public Integer getCutright() {
        return cutright;
    }

    public void setCutright(Integer cutright) {
        this.cutright = cutright;
    }
}