package com.github.chen0040.eureka.web.services;


/**
 * Created by xschen on 18/3/2017.
 */
public interface VersionService {
   String getProfileString();

   boolean isDefaultProfile();

   boolean isWindowsOS();
}
