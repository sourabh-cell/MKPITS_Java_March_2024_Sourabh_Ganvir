package list_program.history_tracking_sys;

import java.time.LocalDate;

public class Page {
    private int pageId;
    private String url;
    private String title;
    String date;

    public Page(int pageId, String url, String title, String date) {
        this.pageId = pageId;
        this.url = url;
        this.title = title;
        this.date = date;
    }

    public int getPageId() {
        return pageId;
    }

    public String getUrl() {
        return url;
    }

    public String getTitle() {
        return title;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Page{" +
                "pageId=" + pageId +
                ", url='" + url + '\'' +
                ", title='" + title + '\'' +
                ", date=" + date +
                '}';
    }
}
