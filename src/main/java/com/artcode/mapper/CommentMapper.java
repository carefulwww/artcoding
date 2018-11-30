package com.artcode.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import com.artcode.model.Comment;

import tk.mybatis.mapper.common.Mapper;

public interface CommentMapper extends Mapper<Comment>{
  
  public ArrayList<Comment> getCommentByProjectId(@Param("projectId")String projectId);

}
