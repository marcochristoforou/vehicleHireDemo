# Vehicle Hire Demo Usinhg Sping Java and Vue.js

This is the first time I've used both of these technologies. Although I have dabbled in other peoples Java code.
I'm more a .NET 5/Node/Angular/React full stack developer guy, but have always felt it should not be difficult to apply similar principles using different tech.

So, I was curious to see how easy it would be do this and I have been meaning to play around with vue for a while.

I think the experience was ok. It took a while (more than 2 hours) and lots of Googling, of course.

It's just an off the cuff hack but a more polished version would need...
* More front end error checking (only enable 'Get Cost' button when information had been supplied by the user)
* Authentication mechanism
* Unit tests
* End-to-end tests (may be using BDD/Cucumber)
* Containerisation
* Set up to run in dev environment (i.e. none of my debug)
* SSL
* Cloud hosting

... and so it goes on.

## Running

I wrote this on iOS, so not sure about Windows or Linux. Was going to get it spinning up in Docker but felt I'd spent enough time.

On a iOS you'll need to install Spring boot.
You'll have to go into the client and run 'npm install'

Then in the root it should all start up by running...
```
./start.sh
```

Then go to 
```
http://localhost:8090
```

Have fun!
