#!/bin/sh
docker build -t game-service:latest .
docker tag game-service:latest 980392958661.dkr.ecr.us-east-1.amazonaws.com/game-service:latest
docker push 980392958661.dkr.ecr.us-east-1.amazonaws.com/game-service:latest