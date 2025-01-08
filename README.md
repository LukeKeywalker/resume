# Resume

Personal resume page hosted at [https://lukasz.michniewicz.contact](https://lukasz.michniewicz.contact)

## Editing

1. From project directory run `./live-reload.sh` in order to start Vite and SBT's fast link reloading.
2. Open local *[live preview](http://localhost:5173)* in web browser

## Deployment

Publishing script assumes that static website S3 bucket has been created in your AWS default region and it's targeted by a CloudFront distribution.

In order to configure the publishing script create an `.env` file with the following content

```
CLOUDFRONT_DISTRIBUTION=<CloudFront Distribution Id>
S3_BUCKET_NAME=<S3 Bucket Name>
```

Run `./publish.sh` in order to build and publish the resume page.