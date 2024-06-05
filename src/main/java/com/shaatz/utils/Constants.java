package com.shaatz.utils;

public class Constants {
	
	private Constants() {
        throw new IllegalStateException();
    }

	public static final class RequestMappings {
		
		public static final String AUTH = "/shaatz/v1/auth";
		public static final String MANAGEMENT = "/shaatz/v1/management";
		public static final String ADMIN = "/shaatz/v1/admin";
		public static final String REGISTER = "/register";
		public static final String AUTHENTICATE = "/authenticate";
		private RequestMappings() {
            throw new IllegalStateException(Global.UTILITY_CLASS);
        }
	}
	
	public static final class MimeTypes {
		
		public static final String APPLICATION_JSON_VALUE= "application/json";
		private MimeTypes() {
            throw new IllegalStateException(Global.UTILITY_CLASS);
        }
	}
	
	public static final class HttpCodes {
		
        public static final int HTTP_200_CODE = 200;
        public static final String HTTP_200_MESSAGE = "Resource Created Successfully";
        public static final int HTTP_201_CODE = 201;
        public static final String HTTP_201_MESSAGE = "Scan created, see HTTP Location header for URI";
        public static final int HTTP_204_CODE = 204;
        public static final String HTTP_204_MESSAGE = "Requested Entity Not Found";
        public static final int HTTP_400_CODE = 400;
        public static final String HTTP_400_MESSAGE = "Bad Request";
        public static final int HTTP_401_CODE = 401;
        public static final String HTTP_401_MESSAGE = "Unauthorized request";
        public static final int HTTP_403_CODE = 403;
        public static final String HTTP_403_MESSAGE = "Access Denied for the Service";
        public static final int HTTP_404_CODE = 404;
        public static final String HTTP_404_MESSAGE = "Resource Not Found";
        public static final int HTTP_409_CODE = 409;
        public static final String HTTP_409_MESSAGE = "Conflict";
        public static final int HTTP_415_CODE = 415;
        public static final String HTTP_415_MESSAGE = "Unsupported media type";
        public static final int HTTP_429_CODE = 429;
        public static final String HTTP_429_MESSAGE = "Rate limiting - user has sent too many requests in a given amount of time";
        public static final int HTTP_500_CODE = 500;
        public static final String HTTP_500_MESSAGE = "Internal Server Errors";
        private HttpCodes() {
            throw new IllegalStateException(Global.UTILITY_CLASS);
        }
    }
	
	public static final class Global {
		
        public static final String AUTH_HEADER_NAME = "Authorization";
        public static final String UID_HEADER_NAME = "UID";
        public static final String UTILITY_CLASS = "Utility class";
        private Global() {
            throw new IllegalStateException(UTILITY_CLASS);
        }
    }
}
