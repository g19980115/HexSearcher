package com.walixiwa.vodhunter.vod;

import java.io.Serializable;

public class BaseVodPlayEntity  implements Serializable {
    private String title;
    private String link;

    public BaseVodPlayEntity() {
    }

    public BaseVodPlayEntity(String title, String link) {
        this.title = title;
        this.link = link;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
