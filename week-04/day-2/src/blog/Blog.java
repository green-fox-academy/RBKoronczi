package blog;

import blogpost.BlogPost;

import java.util.List;

public class Blog {
    List<BlogPost> blog;

    void addBlogPost(String authorName, String title, String text, String publicationDate){
        blog.add(new BlogPost(authorName, title, text, publicationDate));
    }

    void delete(int index){
        blog.remove(index);
    }

    void update(int index, BlogPost blogPost){
        blog.set(index, blogPost);
    }
}
