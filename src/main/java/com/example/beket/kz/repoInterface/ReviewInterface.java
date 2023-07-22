package com.example.beket.kz.repoInterface;

import com.example.beket.kz.model.Review;

import java.util.List;

public interface ReviewInterface {

	List<Review> getReviewsByUserId(Long id);

	List<Review> getAllReviews();

	Review createReview(Review review);

	Review updateReview(Review review);

	void deleteReviewById(Long id);
}
