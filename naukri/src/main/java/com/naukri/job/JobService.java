package com.naukri.job;

import org.apache.catalina.LifecycleState;

import java.util.List;

public interface JobService
{
    List<Job> finaAll();
    void createJob(Job job);
    Job getJobById(Long id);
    boolean deleteJobById(Long id);
    boolean updateJob(Long id, Job upsatedJob);
}
