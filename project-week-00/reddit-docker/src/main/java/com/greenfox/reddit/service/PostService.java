package com.greenfox.reddit.service;

import com.greenfox.reddit.model.Post;

import java.util.List;

public interface PostService {
    public List<Post> listAll();
    public void AddPost(Post newPost);
    public void upVote(long id);
    public void downVote(long id);
    public void delete(long id);
    public List<Post> getDefaultFrontpage(int page);
    public int getPageCount();
}
