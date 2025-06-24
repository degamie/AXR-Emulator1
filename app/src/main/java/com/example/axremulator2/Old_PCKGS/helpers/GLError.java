//package com.example.axremulator2.Common.helpers;
//
//import android.opengl.GLException;
//
//import java.util.List;
//
//public class GLError {
//    public static void maybeHTrowGLError(String reason,String Api){
//        List<Integer> errorCodes=getGLErrors();
//        if(errorCodes!=null){
//            throw new GLException(errorCodes.get(0),formatErrorMessages(reason,Api,errorCodes));
//        }
//
//    }
//
//    private static String formatErrorMessages(String reason, String api, List<Integer> errorCodes) {
//    }
//
//    public static void maybeHTrowGLException() {
//    }
//}
