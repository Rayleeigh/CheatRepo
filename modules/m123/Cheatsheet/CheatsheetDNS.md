## DNS Protokol and how it works

#### DNS Protocol explained

DNS or Domain Name System is a protocol that *operates on port 53*. The protocol is used to translate domain names like www.raybop.com into IP Addresses such as 192.0.2.1. *This is called ***DNSREQUEST****.

When a user types a domain name into a web browser, the browser sends a DNS query to a DNS server in order to translate the domain name into an IP address. *This is called ***DNSLOOKUP****.

The DNS Server then looks up the domain name in its database in this database are files called the DNS zone files. After that is Done the DNS-Server returns the associated IP address back to you respectively back to the browser. *This is called ***DNSREPSONSE****.

The Browser then send a request to the Server of the previously given IP address and the server respnds with the requested web page. *This procedure is called ***DNSRESOLUTION****

In addition to translating domain names into IP addresses, DNS Servers can also provide other information about a domain, DNS Servers can also provide other information about a domain, such as the mail server used for that domain and the names of other DNS Servers associated with the domain.*This procedure is called ***DNS record management****

#### Procedure DNS-Protocol:

1. A user types in a domain name into their web browser. *This query is called ****DNSREQUEST****

2. The browser sends a DNS query to a DNS server, requesting the IP address of the domain name. *This query is called ****DNSRESPONSE****

3. The DNS server looks up the domain name in its database and, if found, returns the IP address. *This query is called ****DNSLOOKUP****

4. The browser then uses the IP address to connect to the website and displays the page. *This query is called ****Domain name Resolution****

1. Describe the purpose of a Domain Name System (DNS).
2. Explain how a DNS server resolves domain names to IP addresses.
3. Explain the differences between an authoritative and recursive nameserver.
4. Describe the role of the root servers in the DNS hierarchy.
5. Explain the role of the DNS zone file in name resolution.
6. Describe the use of DNS records, such as A, CNAME, MX, and SRV.
7. Describe the process of DNS caching.
8. Explain the importance of DNS security and best practices for securing DNS.
9. Explain the role of DNS in the modern Internet.
10. Describe the differences between IPv4 and IPv6 addressing.