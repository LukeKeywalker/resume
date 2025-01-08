#! /bin/bash
source .env

npm run build
aws s3 rm "${S3_BUCKET_NAME}" --recursive --include "dist/*"
aws s3 cp "dist/" "${S3_BUCKET_NAME}" --recursive
aws cloudfront create-invalidation --distribution-id "${CLOUDFRONT_DISTRIBUTION}" --paths '/*' > /dev/null
