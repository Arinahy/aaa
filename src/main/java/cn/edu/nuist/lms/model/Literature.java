package Java_Design;

import java.sql.Date;

public class Literature {
    private long id;
    private String author;
    private String title;
    private String category;
    private String publisher;
    private Date publishTime;
    private String volumeNumber;
    private String issueNumber;
    private long citedNumber;


    public Literature() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public String getVolumeNumber() {
        return volumeNumber;
    }

    public void setVolumeNumber(String volumeNumber) {
        this.volumeNumber = volumeNumber;
    }

    public String getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(String issueNumber) {
        this.issueNumber = issueNumber;
    }

    public long getCitedNumber() {
        return citedNumber;
    }

    public void setCitedNumber(long citedNumber) {
        this.citedNumber = citedNumber;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Literature [");
        builder.append("id=");
        builder.append(id);
        builder.append(", author=");
        builder.append(author);
        builder.append(", category=");
        builder.append(category);
        builder.append(", citedNumber=");
        builder.append(citedNumber);
        builder.append(", issueNumber=");
        builder.append(issueNumber);
        builder.append(", publishTime=");
        builder.append(publishTime);
        builder.append(", publisher=");
        builder.append(publisher);
        builder.append(", title=");
        builder.append(title);
        builder.append(", volumeNumber=");
        builder.append(volumeNumber);
        builder.append("]");
        return builder.toString();
    }

}
