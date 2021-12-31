# bridge-to-kubernetes
IDEA plugin for bridge to kubernetes
# How it works
Just like microsoft bridge to kubernetes, this plugin will create two proxies, one in kubernetes cluster, one in local machine. Then use kubectl port forward to connect them so that the cluster proxy can connect local proxy, then the local proxy can connect your local service. That means when you call kubernetes service , the traffic will forward to your local machine's service. That's it!

