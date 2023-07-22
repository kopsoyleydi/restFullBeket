package com.example.beket.kz.repoImpl;

import com.example.beket.kz.model.Review;
import com.example.beket.kz.repoInterface.ReviewInterface;
import com.example.beket.kz.repository.ReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReviewImpl implements ReviewInterface {

	private final ReviewRepository reviewRepository;

	@Override
	public List<Review> getReviewsByUserId(Long id) {
		return reviewRepository.findAllById(id);
	}

	@Override
	public List<Review> getAllReviews() {
		return reviewRepository.findAll();
	}

	@Override
	public Review createReview(Review review) {
		return reviewRepository.save(review);
	}

	@Override
	public Review updateReview(Review review) {
		return reviewRepository.save(review);
	}

	@Override
	public void deleteReviewById(Long id) {
		reviewRepository.deleteById(id);
	}
}
