package com.test.server;

import com.test.request.UserApiRequest;

public interface QuestionServer {
   public int getRanDom();
   public Boolean insert(UserApiRequest user);
}
