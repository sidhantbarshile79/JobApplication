package com.naukri.review;

import com.naukri.company.CompanyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService{

    private ReviewRepository reviewRepository;
    private CompanyService companyService;

    public ReviewServiceImpl(ReviewRepository reviewRepository, CompanyService companyService) {
        this.reviewRepository = reviewRepository;
        this.companyService = companyService;
    }

    @Override
    public List<Review> getAllReviews(Long companyId) {
        return List.of();
    }

    @Override
    public boolean addReview(Long companyId, Review review) {
        return false;
    }

    @Override
    public Review getReview(Long companyId, Long reviewId) {
        return null;
    }

    @Override
    public boolean updateReview(Long companyId, Long reviewId, Review review) {
        return false;
    }

    @Override
    public boolean deleteReview(Long companyId, Long reviewId) {
        return false;
    }
}
