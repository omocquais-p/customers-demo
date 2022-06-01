# Deploy a workload with TCE and App Toolkit

tanzu apps workload create customers \
--git-repo  https://github.com/omocquais-p/customers-demo \
--git-branch master \
--type web \
--label app.kubernetes.io/part-of=customers \
--build-env "BP_JVM_VERSION=17"  \
--yes \
--tail \
--namespace default

# Application Toolkit
- https://tanzucommunityedition.io/docs/v0.12/package-readme-app-toolkit-0.2.0/

# VMware Tanzu Community Edition
- https://tanzucommunityedition.io/docs/v0.12/