#!/bin/sh
docker build -t game-ui:latest .
docker tag game-ui:latest 980392958661.dkr.ecr.us-east-1.amazonaws.com/game-ui:latest
docker push 980392958661.dkr.ecr.us-east-1.amazonaws.com/game-ui:latest
