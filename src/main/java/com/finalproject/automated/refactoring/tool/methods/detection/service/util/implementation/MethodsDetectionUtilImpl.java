package com.finalproject.automated.refactoring.tool.methods.detection.service.util.implementation;

import com.finalproject.automated.refactoring.tool.files.detection.model.FileModel;
import com.finalproject.automated.refactoring.tool.methods.detection.service.util.MethodsDetectionUtil;
import lombok.NonNull;
import org.springframework.stereotype.Service;

import java.io.File;

/**
 * @author Dufan Quraish
 * @version 1.0.0
 * @since 19 August 2019
 */

@Service
public class MethodsDetectionUtilImpl implements MethodsDetectionUtil {

    @Override
    public String getMethodKey(@NonNull FileModel fileModel) {
        return fileModel.getPath() + File.separator + fileModel.getFilename();
    }
}
