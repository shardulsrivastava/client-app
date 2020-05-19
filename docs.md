## Data persistence with Docker

By default all files created inside a container are stored on a writable container layer.
This data only persists as long as the container exists.

To persist data on the host after container is removed,docker has 3 options :

* Volumes
* Bind mounts
* tmpfs mounts

### Volumes

`Volumes` are the recommended way of perisisting data on host systems. They are managed by Docker and stored on the host system on path `/var/lib/docker/volumes/` .

1. Create a Volume : `docker volume create data`

2. Mount a Volume: `docker run --rm -v data:/app busybox ls -lrtha /app`

3. Delete a Volume: `docker volume rm data`


### Bind mounts

`Bind mounts` are used to mount a host file system directory to the container. They are not managed by Docker. 


To mount current working directory to the container :

```bash
docker run \
       --rm \
       -v "$(pwd)"/data:/app \
       busybox \
       ls -lrtha /app 
```


### tmpfs mounts

`tmpfs` mounts are temporary and persisted in the host memory and are removed when the container stops.
This is useful to temporarily store sensitive files that you don’t want to persist in either the host or the container.
`tmpfs` mounts are only available for Linux kernel based operating systems. 

To create and mount a `tmpfs` volume:
```bash
docker run \
       --rm \
       -v \
       --tmpfs /app \
       busybox \
       /bin/sh -c \
       "echo MySecretToken > /app/token.txt && cat /app/token.txt"
```


## Technology Benefits

### Cloud Agnostic Architecture

Cloud agnostic architecture provides flexible and resilient architecture. It allows us to move workloads from one cloud to another cloud without vendor-lock in.

Kubernetes is one such example. Kubernetes is provided by all the major vendors and its cloud agnostic. 

Every vendor provides its own impementation for the resource such as LoadBalancer and ingress. This way all the resources can be migrated to another cloud vendor's managed kubernetes or self managed kubernetes with no or very minimal changes.

Cloud infrastructure is also prone to disasters such as Google Cloud's multi region was down and cloud agnostic architecure provides resiliency in these cases to keep the application running.


### Jfrog Artifactory


JFrog Artifactory is one of the most famous artifactory which comes with on-premise and cloud based installation. It also provides CI/CD solution.

It acts as a remote repository for artifacts. Maven artifacts can take sometime while downloading from the maven repository and is dependent on the network bandwidth.

JFrog provides faster access to these artifacts by caching them locally every time a jar is requested and serving them from cache next time. 

It can also serve as a private registry for Docker images instead of using cloud based Elastic Container Resgitry(ECR) and Google Container Registry(GCR).



### Jenkins x

Jenkins X is an open source automated CI/CD for cloud native applications on Kubernetes.

It provides developers with a number of benefits including faster software delivery releases, simplicity of installation and configuration and enhances the business sustainability over time.

Every team can run their own Jenkins X in their own namespace thus isolating build system from impacting each other.

It comes with a powerful CLI tool `jx`.

### Circle CI

Circle CI is a cloud based CI tool which allows you to automates  builds, tests, and deployments.

It is free for public repositories on Github and Bitbucket for the first 100,000 minutes of build per week. 

It supports yaml based pipeline configuration and support all the os including MacOS which is specially helpful for building iOS mobile applications.

we can SSH into any job to debug build issues, set up parallelism in .circleci/config.yml file to run jobs faster.


### Kops
Kops is a tool for managing production-grade Kubernetes clusters. It's `kubectl` for clusters.

It supports deployment of kubernetes clusters to existing VPC or create a new VPC from scratch.

It can perform rolling cluster updates and supports heterogeneous clusters by creating multiple instance groups.

It also supports single or multiple master clusters.
