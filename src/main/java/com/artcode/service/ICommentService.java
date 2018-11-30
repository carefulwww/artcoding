package com.artcode.service;

import java.util.ArrayList;

import com.artcode.model.Comment;

public interface ICommentService {

  public ArrayList<Comment> getCommentByProjectId(String projectId);

  public String addComment(Comment comment) throws Exception;
}
