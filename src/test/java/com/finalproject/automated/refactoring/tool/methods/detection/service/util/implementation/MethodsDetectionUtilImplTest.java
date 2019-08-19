package com.finalproject.automated.refactoring.tool.methods.detection.service.util.implementation;

import com.finalproject.automated.refactoring.tool.files.detection.model.FileModel;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertEquals;

/**
 * @author Dufan Quraish
 * @version 1.0.0
 * @since 19 August 2019
 */

public class MethodsDetectionUtilImplTest {

    private MethodsDetectionUtilImpl methodsDetectionUtil;

    private FileModel fileModel;

    @Before
    public void setUp() {
        methodsDetectionUtil = new MethodsDetectionUtilImpl();
        fileModel = FileModel.builder()
                .path("path")
                .filename("Filename.java")
                .content("content")
                .build();
    }

    @Test
    public void getMethodKey_success() {
        String key = methodsDetectionUtil.getMethodKey(fileModel);
        String expectedKey = "path" + File.separator + "Filename.java";

        assertEquals(expectedKey, key);
    }

    @Test(expected = NullPointerException.class)
    public void getMethodKey_failed_fileModelIsNull() {
        methodsDetectionUtil.getMethodKey(null);
    }
}