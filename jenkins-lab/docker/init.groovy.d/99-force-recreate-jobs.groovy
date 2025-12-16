import jenkins.model.Jenkins
import hudson.model.Job

def jenkins = Jenkins.get()

// Удаляем существующие job'ы для принудительного пересоздания
def jobsToDelete = ['pdris-build', 'pdris-deploy']
jobsToDelete.each { jobName ->
    def job = jenkins.getItem(jobName)
    if (job != null) {
        println("Deleting existing job: ${jobName}")
        job.delete()
    } else {
        println("Job ${jobName} does not exist, will be created")
    }
}

println("Job cleanup completed. Jobs will be recreated on next Jenkins startup.")
