package com.example.beket.kz.qrCode;

import java.io.File;

public interface QrCodeGenerator {
	File generateQrCode(String grContent, int width, int height,String filePath);
}