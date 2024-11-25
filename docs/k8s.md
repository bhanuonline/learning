**Kubernetes**
Kubernetes, also known as K8s, is an open source system for automating deployment, scaling, and management of containerized applications
A Kubernetes cluster is a group of nodes that run containerized applications and are managed by Kubernetes
kubectl tool is the most common way to interact with a Kubernetes cluster.

**Cluster**
A set of worker machines, called nodes, that run containerized applications. Every cluster has at least one worker node

**Cluster**
* A cluster is the whole Kubernetes system, including:
* The Control Plane: Schedules and manages workloads.
* The Worker Nodes: Execute the workloads.
* Think of it as an orchestrator that ensures your applications run reliably, scale as needed, and remain healthy.

**Node**
* A node is a single physical or virtual machine within the cluster.
* Each node contributes resources (CPU, memory, storage) to the cluster.
* Nodes are where Pods (smallest deployable units in Kubernetes) run

**Practical Example**

Imagine you deploy a web application on a Kubernetes cluster. Here's how it plays out:

      Cluster:
          * Ensures that your app is always running by restarting Pods if they fail.
          * Distributes your app across multiple nodes for high availability.
          * Monitors resource usage to scale your app when needed.
    
      Nodes:
          * Node 1 may run the frontend container.
          * Node 2 may run the backend container.
          * Node 3 may run the database container.
          * The cluster decides which node runs which part of your app

Commands to Check the Cluster and Nodes
To view the cluster’s overall configuration and status :kubectl cluster-info
To see all nodes in your cluster:kubectl get nodes

**Conclusion**

        Cluster	                                        Node
        Logical grouping of resources and services.	        Physical or virtual machine inside the cluster.
        Decides where to run workloads.	                Executes the workloads (Pods).
        Managed by the Control Plane.	                Communicates with the Control Plane.
        Checked using kubectl cluster-info.	                Checked using kubectl get nodes.


**What is the Control Plane in Kubernetes?**
The Control Plane is the brain of a Kubernetes cluster. It manages the cluster's overall state, schedules workloads, and ensures the desired state of the cluster matches the actual state
**Components of the Control Plane**

#### API Server (kube-apiserver)

Provides a REST interface for interacting with the cluster.
All commands (kubectl, clients, etc.) communicate with this component.

#### Scheduler (kube-scheduler)

Assigns Pods to specific nodes based on resource requirements and constraints.

#### Controller Manager (kube-controller-manager)

Runs background controllers, like:
Node controller (handles node failures).
Deployment controller (manages rolling updates).
Replication controller (ensures the desired number of Pods are running).

#### ETCD

A distributed key-value store that holds all cluster data.
Acts as the source of truth for the cluster's state.

#### Cloud Controller Manager (optional)

Integrates Kubernetes with cloud-provider-specific APIs for managing resources like load balancers or storage.

To check the name and details of your Control Plane node: kubectl get nodes
NAME             STATUS   ROLES                  AGE   VERSION
control-plane    Ready    control-plane,master   2d    v1.27.4
worker-node-1    Ready    worker                 2d    v1.27.4
worker-node-2    Ready    worker                 2d    v1.27.4
The node with the role control-plane or master is your Control Plane.

#### Access the API Server

To verify the API Server (part of the Control Plane), run:kubectl cluster-info

**Command	Purpose**
kubectl get nodes	                        Lists all nodes, including Control Plane.
kubectl describe node <name>	            Detailed info about the Control Plane node.
kubectl cluster-info	                    Displays the API Server's URL (Control Plane).
minikube profile list                       This displays all running clusters and their statuses
kubectl config get-contexts	                List all available clusters (contexts).
kubectl config use-context <context>	    Switch to a specific cluster.
minikube start --profile=<profile-name>	    Create a new cluster with Minikube.
eksctl create cluster --name=<name>	        Create a cluster on AWS EKS.
kubectl config current-context              You can also check which cluster your kubectl is currently pointing to
kubectl config get-contexts
kubectl config use-context <context-name>     To switch to a different cluster (context), use the kubectl config use-context command
kubectl get deployments
kubectl get svc
kubectl get all -n kubernetes-dashboard
kubectl port-forward -n kubernetes-dashboard service/kubernetes-dashboard 8001:80

**Control Plane Node:**
The control-plane role means this node manages the cluster's state and runs workloads. In a production environment, workloads and control-plane components are usually hosted on separate nodes, but Minikube combines them

**What is Kubernetes Dashboard?**
The Kubernetes Dashboard is a web-based UI that helps you manage your Kubernetes cluster. It allows you to view information about your cluster, such as namespaces, deployments, pods, and more.