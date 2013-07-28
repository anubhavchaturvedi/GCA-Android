package com.yasiradnan.conference;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table ABSTRACTS_ITEM.
 */
public class AbstractsItem {

    private Long id;
    /** Not-null value. */
    private String Correspondence;
    /** Not-null value. */
    private String title;
    /** Not-null value. */
    private String url;
    /** Not-null value. */
    private String text;
    /** Not-null value. */
    private String type;
    /** Not-null value. */
    private String topic;
    /** Not-null value. */
    private String coi;
    /** Not-null value. */
    private String cite;

    public AbstractsItem() {
    }

    public AbstractsItem(Long id) {
        this.id = id;
    }

    public AbstractsItem(Long id, String Correspondence, String title, String url, String text, String type, String topic, String coi, String cite) {
        this.id = id;
        this.Correspondence = Correspondence;
        this.title = title;
        this.url = url;
        this.text = text;
        this.type = type;
        this.topic = topic;
        this.coi = coi;
        this.cite = cite;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /** Not-null value. */
    public String getCorrespondence() {
        return Correspondence;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setCorrespondence(String Correspondence) {
        this.Correspondence = Correspondence;
    }

    /** Not-null value. */
    public String getTitle() {
        return title;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setTitle(String title) {
        this.title = title;
    }

    /** Not-null value. */
    public String getUrl() {
        return url;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setUrl(String url) {
        this.url = url;
    }

    /** Not-null value. */
    public String getText() {
        return text;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setText(String text) {
        this.text = text;
    }

    /** Not-null value. */
    public String getType() {
        return type;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setType(String type) {
        this.type = type;
    }

    /** Not-null value. */
    public String getTopic() {
        return topic;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setTopic(String topic) {
        this.topic = topic;
    }

    /** Not-null value. */
    public String getCoi() {
        return coi;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setCoi(String coi) {
        this.coi = coi;
    }

    /** Not-null value. */
    public String getCite() {
        return cite;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setCite(String cite) {
        this.cite = cite;
    }

}