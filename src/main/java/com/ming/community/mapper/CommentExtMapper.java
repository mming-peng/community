package com.ming.community.mapper;


import com.ming.community.model.Comment;

public interface CommentExtMapper {
    int incCommentCount(Comment comment);
}