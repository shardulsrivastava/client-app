# pull official base image
FROM node:13.12.0-alpine as react-build

ENV NPM_CONFIG_LOGLEVEL warn

WORKDIR /app

COPY package.json yarn.lock ./

RUN yarn

COPY . ./

RUN yarn run build --production


FROM nginx:alpine
COPY nginx/nginx.conf /etc/nginx/conf.d/default.conf
COPY --from=react-build /app/build /usr/share/nginx/html
EXPOSE 80
CMD ["nginx", "-g", "daemon off;"]