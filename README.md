[![License: CC BY-NC-SA 4.0](https://img.shields.io/badge/License-CC_BY--NC--SA_4.0-lightgrey.svg)](https://creativecommons.org/licenses/by-nc-sa/4.0/)

# Table of Contents
1. [Introduction](#introduction)
2. [Setting up Eclipse](#setting-up-eclipse)
    - [Prerequisites](#prerequisites)
    - [Installation Steps](#installation-steps)
3. [Designing an Assessment Kit](#designing-an-assessment-kit)

# Introduction
This project provides a set of Eclipse plugins that facilitate the creation and editing of assessment kit description files using Xtext. By installing these plugins, you can take advantage of the following features:
- Immediate syntax error feedback
- Syntax highlighting
- And code completion. 

This guide will walk you through the setup process and help you get started with designing assessment kits.

# Setting up Eclipse
## Prerequisites:

Before you begin, make sure you have the necessary prerequisites in place:

#### Eclipse IDE for Java and DSL Developers 
Download and install this special version of Eclipse, specifically tailored for DSL development. You can find it on the Eclipse [packages download page](https://www.eclipse.org/downloads/packages/).

#### Update site
Download the latest update site ZIP archive by clicking on the button below.
<!-- BEGIN LATEST UPDATE SITE DOWNLOAD BUTTON -->
[![Download zip](https://custom-icon-badges.demolab.com/badge/-Download-blue?style=for-the-badge&logo=download&logoColor=white "Download zip")](https://github.com/flickit-platform/flickit-dsl-editor/releases/download/v2.6.0/update-v2.6.0.zip)
<!-- END LATEST UPDATE SITE DOWNLOAD BUTTON -->


## Installation Steps:

1. Open Eclipse and navigate to the **Help** menu.

2. Select **Install New Software**.

3. In the **Install** window, click Add and then choose **Archive** in the **Add Repository** window. Provide the path to the **update-*.zip** file you downloaded earlier.

4. Back in the **Install** window, click **Select All**, and then click **Next**.

5. Follow the on-screen instructions to complete the installation process.

6. When prompted, in the **Trust Artifacts** window, click **Select All**, and then click **Trust Selected**.

7. After the installation is complete, click **Restart Now** to ensure that the plugins are activated.

# Designing an Assessment Kit

To begin designing an assessment kit, follow these steps:

1. Create a new project in Eclipse.

2. Within your project, create a new file with the extension **.ak**. This is where you will design your assessment kit.

3. When you create the **.ak** file, a dialog titled **"Configure Xtext"** will appear, asking if you want to convert your project to an Xtext project. Click **"Yes"** to enable Xtext functionality for your project.

You can now start designing your assessment kit within the created .ak file.
