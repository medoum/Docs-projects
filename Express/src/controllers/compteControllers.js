import mongoose from "mongoose";
import { CompteSchema } from "../models/crmModels";


const Compte = mongoose.model('Compte', CompteSchema);

export const addNewCompte = (req, res)=>{
    let newCompte = new Compte(req.body);

    newCompte.save((err, compte)=>{
        if(err){
            res.send(err);
        }
        res.json(compte);
    })
};

export const getCompte = (req, res)=>{

    Compte.find({},(err, compte)=>{
        if(err){
            res.send(err);
        }
        res.json(compte);
    })
};