Coding Challenge: CIDR Networks and IPAddresses
===============================================

Beeing a software development company doing a lot of work in the cloud computing area we have to deal a lot with IpAddresses.
Sadly the java.net.InetAddress does not have all the needed functionality to do calculations based on them.
For example we often have to calculate the next IP in a given Network, or check if a IP or Network is in a other Network.

To make the long story short, try to implement the missing parts in the given challenge.
As a start you can have a look at:

http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing
to get all the glory Details about CIDR.
 
How does this challenge work ?
-----------------------------

I already wrote a very simple test suite, please modify it to your needs, see it as a starting point.

1. Fork the [x-cellent challenge GitHub repo](https://github.com/xcellent/challenge).
2. Create a working implementation of the CIDR.java Class, feel free to do architectural changes as you like.
3. Test your program by executing `mvn clean install, all tests should pass.
4. Once you think the job is done, write a simple mail with a link to you fork to: jobs@x-cellent.com


have fun !
