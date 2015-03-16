JSON-RPC 2.0 Server

Copyright (c) Vladimir Dzhuvinov, 2010 - 2015

README

Simple server framework for processing JSON-RPC 2.0 requests and notifications.


Usage:

    1. Implement request and / or notification handlers for the various
       expected JSON-RPC 2.0 messages. A handler may process one or more
       request / notification methods (identified by method name).

    2. Create a new Dispatcher and register the handlers with it.

    3. Pass the received JSON-RPC 2.0 requests and notifications to the
       appropriate Dispatcher.dispatch(...) method, then, if the message is a
       request, pass back to the client the resulting JSON-RPC 2.0 response.

Requirements:

    * Java 1.5 or later

    * The package depends on the JSON-RPC 2.0 Base library and the JSON Smart
      library for JSON encoding and decoding (fork of the popular JSON.simple
      toolkit, but with more efficient parsing).


Visit the library home page for usage, examples and updates:

    http://software.dzhuvinov.com/json-rpc-2.0-server.html


[EOF]
