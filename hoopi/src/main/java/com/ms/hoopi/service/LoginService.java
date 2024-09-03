package com.ms.hoopi.service;

import com.ms.hoopi.model.entity.User;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.util.Map;

public interface LoginService {
    boolean validateUser(HttpServletResponse response, HttpServletRequest request, User user);

    Map<String, String> getUserInfo(HttpServletRequest request);
}
