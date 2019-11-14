package com.sd.oc.batch.launchers;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MailSenderLauncher {

    @Autowired
    @Qualifier("borrowingsenderJob")
    Job borrowingSenderStep;

    @Autowired
    @Qualifier("reservationsenderJob")
    Job reservationSenderJob;

    @Autowired
    JobLauncher jobLauncher;

    @Scheduled(cron = "0 11 16 * * *")
    public void scheduleBorrowing() {
        JobParameters parameters = new JobParametersBuilder()
                .addLong("currentTime", System.currentTimeMillis())
                .toJobParameters();
        try {
            jobLauncher.run(borrowingSenderStep, parameters);
        } catch (JobExecutionAlreadyRunningException e) {
        } catch (JobRestartException e) {
        } catch (JobInstanceAlreadyCompleteException e) {
        } catch (JobParametersInvalidException e) {
        }

    }

    @Scheduled(cron = "0 27 16 * * *")
    public void scheduleReservation() {
        JobParameters parameters = new JobParametersBuilder()
                .addLong("currentTime", System.currentTimeMillis())
                .toJobParameters();
        try {
            jobLauncher.run(reservationSenderJob, parameters);
        } catch (JobExecutionAlreadyRunningException e) {
        } catch (JobRestartException e) {
        } catch (JobInstanceAlreadyCompleteException e) {
        } catch (JobParametersInvalidException e) {
        }

    }
}
