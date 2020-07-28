package com.yourcompany.appstrack;

public class Model {

    private String title,description, comments,like,share;
    private int img,posts;

    public String getTitle() { return title;  }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public int getposts() {return posts; }

    public void setposts(int posts) { this.posts = posts;    }

    public String getcomments() { return comments;  }

    public void setcomments(String comments) {
        this.comments = comments;
    }

    public String getLike() {return like; }

    public void setLike(String like) {this.like = like; }

    public String getShare() { return share; }

    public void setShare(String share) { this.share = share; }

}
