# Static-Website
##Deploying Static Website using Load Balancer by ARM Template

**Develop a dynamic, user-friendly Gardening website to enhance customer engagement and streamline operations. The site will feature a visually appealing homepage, detailed menu with high-quality images, and online ordering system. It will also include an "About Us" page, contact information, and links to social media. The website will be responsive, ensuring optimal performance on both desktop and mobile devices. The goal is to effectively represent the, provide essential information, and improve customer experience.


##Problem Statement

In today's fast-paced world, many individuals face challenges in maintaining a healthy and sustainable garden. Additionally, modern urban lifestyles leave little time for detailed garden management, resulting in missed opportunities to cultivate personal green spaces that can enhance well-being and contribute to environmental sustainability. There is a need for an accessible platform that provides practical, reliable, and user-friendly gardening plants and tools required for gardening.

##Project Goals

-Deploy the **Gardening** website on Azure using ARM templates.
-Set up a **Virtual Network (VNet)** with two Subnets and a **Network Security Group (NSG)**.
-Use a **Load Balancer** to distribute traffic between two VMs located in different availability zones.
-Host the static website on these VMs and make it accessible via the load balancer's frontend IP.

##Technologies and Azure Services Used

1. **Azure CLI**: Used to create the resource group and Virtual Network.
2. **ARM Templates**: Automated the creation of VNet, subnets, and NSG.
3. **Azure Virtual Machines (VMs)**: Hosted the Restaurant website.
4. **Azure Load Balancer**: Distributed the traffic between two VMs to ensure high availability.
5. **Nginx**: Used as a web server on both VMs to serve the static content.
6. **Git**: Cloned the website from GitHub onto the VMs using a custom script.
7. **Custom Script Extension**: Used to automatically configure the VMs upon deployment.

## Project Steps

### 1. Website Development
- **Gardening**: A static website enabling customers to explore and order a wide variety of high-quality plants at affordable prices.

### 2. Deploying the Website on GitHub
- The frontend of **Gardening** was uploaded to a public GitHub repository: [Frontend-Restaurant](https://github.com/Kiranmai-Yadav/Static-Website.git).

### 3. Azure Deployment Using ARM Templates
- **Resource Group**: Created using Azure CLI to hold all the resources.
- **Virtual Network (VNet)**: Set up using an ARM template, which included two subnets for distributing the VMs.
- **Network Security Group (NSG)**: Applied inbound rules to allow traffic on ports 22 (SSH) and 80 (HTTP).
  
### 4. Virtual Machines Setup
- **VM 1**: Created in Availability Zone 1 using Azure Portal. Configured with:
  - Custom Script Extension to clone the website from GitHub.
  - Networking settings to connect to the VNet and assigned Subnet.
  
  Custom Script:
  ```bash
  #!/bin/bash
  sudo apt update
  sudo apt install nginx git -y
  cd /tmp && git clone https://github.com/medisettyvaishnavi/Restaurant.git
  sudo rm -rf /var/www/html/index.nginx-debian.html
  sudo cp -r /tmp/mysitee/* /var/www/html/
  ```

- **VM 2**: Created in Availability Zone 2 with the same configuration as VM 1.

### 5. Load Balancer Configuration
- **Load Balancer**: Configured to distribute traffic between VM 1 and VM 2.
  - **Frontend IP Configuration**: Assigned a new frontend IP for external access.
  - **Backend Pool**: Added both VMs to the backend pool for traffic distribution.
  - **Load Balancing Rule**: Defined to balance HTTP traffic (port 80) across the VMs.
  - **Health Probe**: Set up to monitor the health of the VMs and ensure traffic is routed only to healthy VMs.

### 6. Testing and Accessing the Website
- After the load balancer deployment, the website became accessible via the frontend IP of the load balancer. Customers can access the website **Gardening** and buy any kind of plants, gardening tools and pots from it.
  
## How to Use Restaurant

1. Exlpore our website.
2. Select the food item which you want from the menu.
3. Confirm your order by doing payment.
4. If you are satisfied with our service can follow us.

## Azure Services and Tools Used

- **Azure CLI**: Resource group creation and management.
- **Azure Resource Manager (ARM) Templates**: Infrastructure-as-Code to deploy resources.
- **Virtual Network (VNet)**: Networking and subnetting.
- **Network Security Group (NSG)**: Security rules for VM access.
- **Azure Virtual Machines**: Hosting the website on multiple VMs.
- **Azure Load Balancer**: Load balancing between VMs.
- **Nginx**: Web server for hosting static content.
- **Git**: Version control and cloning the website onto VMs.
- **Custom Script Extension**: Automated configuration of VMs.

 

##Live Website and Resources

-**Website Link**: [Gardening](https://github.com/Kiranmai-Yadav/Static-Website.git)

-**Project Video Link**: [Project Video]

-**Screenshots**:

         **Created Resource Group Screenshot**
         -![rg created in arm](https://github.com/user-attachments/assets/95bac947-0d94-4e73-9a43-57aa025e1ae7)
         -![rg-created-using arm](https://github.com/user-attachments/assets/c539fb34-b131-461e-9027-a90a6a2700a7)
      
         **Resource Group Deployment Command Output**
         -![rg-deployment](https://github.com/user-attachments/assets/dfd0ba72-afbc-4e52-86f5-650ace6cc79e)

         **VNet Subnets NSG ARM Template Output**
         -![nsg-vnet-sunets-created in arm](https://github.com/user-attachments/assets/6cab042b-6b5e-4744-913c-fcc9bd549d88)
       
         **Created VNet and Subnets Screenshot**
         -![vnet subnets-created](https://github.com/user-attachments/assets/0985b9b1-952e-458b-9317-9e5b2012ad55)

         **Deployed VM 1 Screenshot**
         -![vm1 created](https://github.com/user-attachments/assets/c12a7071-3e74-4b7f-b355-250fa9c82a45)

         **Deployed VM 2 Screenshot**
         -![vm2 created](https://github.com/user-attachments/assets/4d41af02-4e06-47f3-9121-cfa8fe54aa5f)
 
         **Deployed LoadBalancer Screenshot**
         -![lb created](https://github.com/user-attachments/assets/d4d9beb5-f5eb-412e-8e6f-3464b9505a7c)

         **Website Home Page Screenshot**
         -![gogreen-home](https://github.com/user-attachments/assets/227958d6-a0e1-4433-a960-f2ce5dffdc16)

         **Category Page after complete Deployment**
         -![gogreen-category](https://github.com/user-attachments/assets/0958f1a8-0798-4084-9d46-bd45dc4a6ab5)

         **About Us Page after complete Deployment**
         -![gogreen-about](https://github.com/user-attachments/assets/bb85dd5e-24ea-46ee-a0cb-77d2a049a7a6)

         **Contact Us Page after complete Deployment**
         -![gogreen-contact](https://github.com/user-attachments/assets/21c6fb7d-3c16-4110-be32-929ee60b6838)

##Conclusion

This sample business plan provides a comprehensive roadmap for launching and operating a successful Gardening. By following the outlined steps and utilizing the provided resources, entrepreneurs can create a strong foundation for their business and achieve long-term success.


##Author

**P Kiranmai Yadav**
**Prathibha Aakula**
**Sana Sultana**
Deployed with team as part of learning Azure's cloud infrastructure.


