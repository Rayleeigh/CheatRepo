# Telnet - Port 23/tcp telnetd exploit

##### This Exploitation is divided into three parts
* Information Gathering (Passive and Active)
* telnet Password Brute Force Attack with hydra tools
* Login With telnet tool (wit root access) 

### Step 1 - Nmap
For the first step what you want to do is run a nmap scan for your target system to see if port 23 which is used for telnet is open. This can be done by doing the following:

nmap -T4 -A -p 23 <target ip adress>

* T4 is for timing (1-5; higher is faster)
* -A for (-A: Enable OS detection, version detection, script scanning and traceroute)
* -p 23 for (-p: Only scan port 23)
  
### Step 2 - Passive Reconnaissance using http
since this doesn't work on my target I dont have anything to show.

### Step 3 - Brute Force Attack with Hydra 
Hydra is a tool that usually comes pre-installed with newer kali linux version so just open it in terminal. If this is not the case for you, you can simply install it by using following command:

```
sudo apt install hydra
```

To start the bruteforce attack on your telnet server/target home system just use the command shown below:
```
hydra -t4 -l user -P /usr/share/wordlists/rockyou.txt -vV <TARGET-IP> telnet
```

