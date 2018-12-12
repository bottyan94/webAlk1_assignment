package iit.uni.miskolc.hu.controller.converter;

import dto.HrDTO;
import dto.JobDTO;
import iit.uni.miskolc.hu.exceptions.InvalidIDFormatExceptions;
import iit.uni.miskolc.hu.model.Education;
import iit.uni.miskolc.hu.model.Hr;
import iit.uni.miskolc.hu.model.Job;
import iit.uni.miskolc.hu.model.JobType;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;

public class Converter {
    public static Job unmarshalJob(JobDTO jobDTO) throws InvalidIDFormatExceptions {
        return new Job(jobDTO.getJobID().intValue(),jobDTO.getJobName(), JobType.valueOf(jobDTO.getJobType()),jobDTO.getJobDescription(),jobDTO.getJobSalary(), Education.valueOf(jobDTO.getJobEducation()),jobDTO.getHrName());
    }

    public static JobDTO marshalJob(Job job) throws InvalidIDFormatExceptions {
        JobDTO jobDTO = new JobDTO();
        jobDTO.setJobID(BigInteger.valueOf(job.getJobID()));
        jobDTO.setJobName(job.getJobName());
        jobDTO.setJobType(job.getJobType().toString());
        jobDTO.setJobDescription(job.getJobDescription());
        jobDTO.setJobSalary(job.getJobSalary());
        jobDTO.setJobEducation(job.getEducation().toString());
        jobDTO.setHrName(job.gethrName());

        return jobDTO;
    }

    public static Collection<JobDTO> marshalJobList(Collection<Job> jobs) throws InvalidIDFormatExceptions {
        Collection<JobDTO> jobDTOs = new ArrayList<>();
        for (Job job:jobs){
            jobDTOs.add(Converter.marshalJob(job));
        }
        return jobDTOs;
    }




    public static HrDTO marshalHr(Hr hr) throws InvalidIDFormatExceptions {
        HrDTO hrDTO = new HrDTO();
        hrDTO.setHrName(hr.getHrName());
        hrDTO.setHrEmail(hr.getEmail());
        hrDTO.setHrID(BigInteger.valueOf(hr.getHrID()));

        return hrDTO;
    }

    public static Collection<HrDTO>marshalHrList(Collection<Hr> hrs) throws InvalidIDFormatExceptions {
        Collection<HrDTO> hrDTOS =new ArrayList<>();
        for (Hr hr: hrs){
            hrDTOS.add(Converter.marshalHr(hr));
        }
        return hrDTOS;
    }
}
