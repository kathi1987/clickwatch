CREATE TABLE "HandlerRecorder"
(
  "experimentId" text NOT NULL,
  "nodeId" text NOT NULL,
  "qualifiedName" text NOT NULL,
  "timestamp" bigint NOT NULL,
  "value" text NOT NULL
)
WITH (
  OIDS=FALSE
);
ALTER TABLE "HandlerRecorder" OWNER TO clickwatch;
