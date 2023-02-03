import mongoose from "mongoose";

const Schema = mongoose.Schema;

export const ContactSchema = new  Schema({
    firstName: {
        type: String,
        required: 'Entrer un prénom'
    },
    lastName: {
        type: String,
        required: 'Entrer un nom de famille'
    },
    email: {
        type: String,
    },
    conpany: {
        type: String,
    },
    phone: {
        type: Number,
    },
    created_at: {
        type: Date,
        default: Date.now
    },
});

export const CompteSchema = new  Schema({
    type: {
        type: String,
        required: 'Entrer un type'
    },
    created_at: {
        type: Date,
        default: Date.now
    },
});