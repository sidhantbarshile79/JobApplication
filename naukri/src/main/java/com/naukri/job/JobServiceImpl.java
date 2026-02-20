package com.naukri.job;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobServiceImpl implements JobService{

    private JobRepository jobRepository;

    public JobServiceImpl(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    @Override
    public List<Job> finaAll() {
        return jobRepository.findAll();
    }

    @Override
    public void createJob(Job job) {
        jobRepository.save(job);
    }

    @Override
    public Job getJobById(Long id) {
        return jobRepository.findById(id).orElse(null);
    }

    @Override
    public boolean deleteJobById(Long id) {
        try {
            jobRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean updateJob(Long id, Job upsatedJob) {
        Optional<Job> jobOptional = jobRepository.findById(id);

        if (jobOptional.isPresent())
        {
            Job job= jobOptional.get();
            job.setTitle(upsatedJob.getTitle());
            job.setDescription(upsatedJob.getDescription());
            job.setMinSalary(upsatedJob.getMinSalary());
            job.setMaxSalary(upsatedJob.getMaxSalary());
            job.setLocation(upsatedJob.getLocation());
            return true;
        }
        return false;
    }
}
