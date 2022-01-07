# bridge-to-kubernetes
IDEA plugin for bridge to kubernetes
## How it works
Just like microsoft bridge to kubernetes, this plugin will create one proxy in kubernetes cluster. Then use kubectl port forward to connect them so that the cluster proxy can connect your local service. That means when you call kubernetes service , the traffic will forward to your local machine's service. That's it!
## Components
This plugin has three components:
- Kubernetes Connector(kubectl);
- ServiceManager, A Internal Service handler in plugin, create customized service and so on;
- GUI tools, Get user input and display interface.