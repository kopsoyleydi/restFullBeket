package com.example.beket.kz.qrCode;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;

@Service
public class QrCodeService implements QrCodeGenerator{

	private Logger logger = LoggerFactory.getLogger(QrCodeGenerator.class);
	@Override
	public File generateQrCode(String grContent, int width, int height,String filePath) {
		try {
			QRCodeWriter qrCodeWriter = new QRCodeWriter();
			BitMatrix bitMatrix = qrCodeWriter.encode(grContent, BarcodeFormat.QR_CODE, width, height);
			// Convert the BitMatrix to an image file
			File qrCodeFile = new File(filePath);
			MatrixToImageWriter.writeToPath(bitMatrix, "PNG", qrCodeFile.toPath());
			return qrCodeFile;
		}catch (WriterException e){
			logger.error(e.getMessage(), e);
		}catch (IOException e){
			logger.error(e.getMessage(), e);
		}
		return null;
	}
}