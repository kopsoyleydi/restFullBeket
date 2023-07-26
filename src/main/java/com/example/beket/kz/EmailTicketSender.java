package com.example.beket.kz;

import com.example.beket.kz.model.Ticket;
import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailTicketSender {

	private final JavaMailSender mailSender;

	public void sendEmail(String toEmail,
	                      String subject,
	                      Ticket tickets) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("omyrzakovbeksultan1@gmail.com");
		message.setTo(toEmail);
		String body = "Departure location: " + tickets.getRoadId().getDeparture().getStations().get(0).getAddress() +
				", your bus gov number: " + tickets.getRoadId().getBus_id().getGovNumber() + ", your place in this: "
				+ tickets.getPlace() + ", departure date: " + tickets.getRoadId().getDeparture_date() + ", departure-time: "+tickets.getRoadId().getDeparture_time()+ ", ticket prime code: "
				+ tickets.getPrimeCodeTicket() + ", please scan this code. ";
		message.setText(body);
		message.setSubject(subject);
		mailSender.send(message);
		System.out.println("Mail send success");
	}
}