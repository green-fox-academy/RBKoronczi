provider "aws" {
region     = "eu-north-1"
}

resource "aws_instance" "example" {
instance_type = "t3.micro"
ami = "ami-86fe70f8"
tags {
Name = "terraform-import-practice"
}
}
