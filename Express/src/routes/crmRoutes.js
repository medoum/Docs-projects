import { runInNewContext } from "vm";
import { addNewCompte, getCompte } from "../controllers/compteControllers";
import { addNewContact, deleteContact, getContact, getContactWithId, updateContact } from '../controllers/crmControllers'

const routes = (app) => {
    app.route('/contact')

        //Liste des contacts
        .get((req, res, next) => {
            //middleware
            console.log(`Request de: ${req.originalUrl}`)
            console.log(`Request type: ${req.method}`)
            next();
        }, getContact)

        //Nouveau contact
        .post(addNewContact)

    app.route('/contact/:contactId')

        //Recuperer le contact par Id
        .get(getContactWithId)

        // Modifier le contact
        .put(updateContact)

        //Supprimer un contact par Id
        .delete(deleteContact)
    /*************************************************************************************************************/
    app.route('/compte')

        //Liste des comptes
        .get((req, res, next) => {
            //middleware
            console.log(`Request de: ${req.originalUrl}`)
            console.log(`Request type: ${req.method}`)
            next();
        }, getCompte)

        //Nouveau contact
        .post(addNewCompte)

    app.route('/compte/:compteId')

    // //Recuperer le compte par Id
    // .get(getCompteWithId)

    // // Modifier le compte
    // .put(updateCompte)

    // //Supprimer un compte par Id
    // .delete(deleteCompte)
}
export default routes;