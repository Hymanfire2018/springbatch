package cn.fish.springbatch;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbatchApplicationTests {
    
    private static final Logger log  = LoggerFactory.getLogger(SpringbatchApplicationTests.class);

    @Autowired
    private JobLauncher jobLauncher;
    @Autowired
    private Job importJob;

    @Test
    public void contextLoads() throws JobParametersInvalidException, JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {

        JobParameters jobParameters = new JobParametersBuilder()
                .addLong("time", System.currentTimeMillis())
                .addString("input.file.name", "E:\\NT_BSC_BUDGETVTOLL.csv")
                .toJobParameters();
        jobLauncher.run(importJob, jobParameters);
        log.info("testBatch1执行完成");

    }

}
